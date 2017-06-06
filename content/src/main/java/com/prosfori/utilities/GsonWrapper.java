package com.prosfori.utilities;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class GsonWrapper {

    private static GsonWrapper instance;
    private Gson gson;

    private GsonWrapper(){
        GsonBuilder builder = new GsonBuilder();

        builder.registerTypeAdapter(Timestamp.class, (JsonDeserializer<Timestamp>) (json, typeofT, context) -> {
            String date = json.getAsString();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            format.setTimeZone(TimeZone.getTimeZone("GMT+2"));

            try{
                return new Timestamp(format.parse(date).getTime());
            }catch (ParseException e){
                System.err.println("error during time transformation");
                return null;
            }
        });
        //builder.registerTypeAdapter(Date.class, (JsonDeserializer<Date>)(json, typeofT, context) -> new Date(json.getAsJsonPrimitive().getAsLong()));
        //builder.registerTypeAdapter(Date.class, UnixEpochDateTypeAdapter.getInstance());

        builder.registerTypeAdapter(Date.class, (JsonDeserializer<Date>)(json, typeofT, context) -> {
            String date = json.getAsString();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            format.setTimeZone(TimeZone.getTimeZone("GMT+2"));

            try{
                return format.parse(date);
            }catch (ParseException e){
                System.err.println("error during time transformation");
                return null;
            }
        });

        gson = builder.create();
    }

    public static GsonWrapper getInstance(){
        if(instance == null) {
            instance = new GsonWrapper();
            return instance;
        }
        return instance;
    }

    public String toJson(Object object){
        return gson.toJson(object);
    }

    public String toJson(Object object, Type type){
        return gson.toJson(object, type);
    }

    //TODO get it to return type Type
    public Object fromJson(String json, Type type){
        return gson.fromJson(json, type);
    }
}

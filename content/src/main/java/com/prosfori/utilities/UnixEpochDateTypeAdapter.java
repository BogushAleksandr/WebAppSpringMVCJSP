package com.prosfori.utilities;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.Date;

/**
 * Created by Admin on 21.05.2017.
 */
final class UnixEpochDateTypeAdapter extends TypeAdapter<Date> {
    private static final TypeAdapter<Date> adapter = new UnixEpochDateTypeAdapter();

    private UnixEpochDateTypeAdapter(){}

    public static TypeAdapter<Date> getInstance(){
        if(adapter == null){
            return new UnixEpochDateTypeAdapter();
        }
        return adapter;
    }

    @Override
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date.getTime());
    }

    @Override
    public Date read(JsonReader jsonReader) throws IOException {
        return new Date(jsonReader.nextLong());
    }
}

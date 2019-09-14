package com.example.indianrailwaycirculars;

import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonHashMap extends LinkedHashMap<String, Object> {

    public JsonHashMap() {
        super();
    }

    public JsonHashMap(String jsonString) {
        super();
        putAll((Map<? extends String, ?>) new Gson().fromJson(jsonString, new TypeToken<LinkedHashMap<String, Object>>() {
        }.getType()));
    }


    @Override
    public String toString() {
        return GsonUtils.convertToJSON(this);
    }
}


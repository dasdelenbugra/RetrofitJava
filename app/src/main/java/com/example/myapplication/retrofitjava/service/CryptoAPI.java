package com.example.myapplication.retrofitjava.service;

import com.example.myapplication.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableConverter;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //GET, POST, UPDATE, DELETE
    //URL BASE : https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
    //GET: atilsamancioglu/K21-JSONDataSet/blob/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();


    //Call<List<CryptoModel>> getData();




}

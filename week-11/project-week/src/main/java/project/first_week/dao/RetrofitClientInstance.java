package project.first_week.dao;

import org.springframework.stereotype.Repository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Repository
public class RetrofitClientInstance {

    private static Retrofit retrofit;
    private static String url = "https://api.themoviedb.org/3";

    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

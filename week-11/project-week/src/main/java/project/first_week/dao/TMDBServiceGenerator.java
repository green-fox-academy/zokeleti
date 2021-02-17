package project.first_week.dao;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TMDBServiceGenerator {

    private static final String BASE_URL = "https://api.themoviedb.org/";

    private static Retrofit.Builder builder
            = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    private static OkHttpClient.Builder httpClient
            = new OkHttpClient.Builder();

    public static <TMDBServiceGenerator> TMDBServiceGenerator createService(Class<TMDBServiceGenerator> serviceClass) {
        return retrofit.create(serviceClass);
    }

}

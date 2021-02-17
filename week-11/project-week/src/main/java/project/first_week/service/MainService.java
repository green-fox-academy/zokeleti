package project.first_week.service;

import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import project.first_week.dao.GenresReceiveDTOService;
import project.first_week.dto.Genre;
import project.first_week.dto.GenresReceiveDTO;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

@Service
public class MainService {

    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();

    public List<Genre> getListOfGenres(String apiKey){
        GenresReceiveDTOService service = retrofit.create(GenresReceiveDTOService.class);
        Call<GenresReceiveDTO> callSync = service.getGenres(apiKey);
        try {
            Response<GenresReceiveDTO> response = callSync.execute();
            GenresReceiveDTO genresReceiveDTO = response.body();
            return genresReceiveDTO.getGenres();
        } catch (Exception ex) {
            System.err.println("not working");
            return null;
        }
    }

}

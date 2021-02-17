package project.first_week.dao;

import project.first_week.dto.GenresReceiveDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GenresReceiveDTOService {
    @GET("/3/genre/movie/list")
    public Call<GenresReceiveDTO> getGenres(
            @Query("api_key") String apiKey);


}

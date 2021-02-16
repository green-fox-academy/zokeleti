package project.first_week.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.first_week.dto.AllGenresDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

@Repository
public interface IAllGenresRetrofitDAO {

    @GET("/genre/movie/list")
    Call<AllGenresDTO> getGenres(@Query("api_key") String apiKey) throws IOException;
}

package project.first_week.dao;

import project.first_week.dto.AllGenresDTO;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class AllGenresDAO implements IAllGenresRetrofitDAO{


    @Override
    public AllGenresDTO getGenres(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IAllGenresRetrofitDAO allGenresRetrofitDAO = retrofitInstance.create(IAllGenresRetrofitDAO.class);
        Call<AllGenresDTO> allGenres = allGenresRetrofitDAO.getGenres("apiKey");
        Response<AllGenresDTO> execute = allGenres.execute();
        AllGenresDTO allGenresDTO = execute.body();

        return allGenresDTO;
    }
}

package project.first_week.service;


import org.springframework.stereotype.Service;
import project.first_week.dao.GenresReceiveDTOService;
import project.first_week.dao.TMDBServiceGenerator;
import project.first_week.dto.Genre;
import project.first_week.dto.GenresReceiveDTO;
import retrofit2.Call;
import retrofit2.Response;


import java.util.List;

@Service
public class MainService {

    GenresReceiveDTOService service
            = TMDBServiceGenerator.createService(GenresReceiveDTOService.class);

    public List<Genre> getListOfGenres(String apiKey){
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

    /*final GenresReceiveDTO[] genres = new GenresReceiveDTO[1];

        callAsync.enqueue(new Callback<GenresReceiveDTO>() {
            @Override
            public void onResponse(Call<GenresReceiveDTO> call, Response<GenresReceiveDTO> response) {
                genres[0] = response.body();
            }

            @Override
            public void onFailure(Call<GenresReceiveDTO> call, Throwable throwable) {
                System.out.println(throwable);
            }

        });

        return genres[0].getGenres();*/

}

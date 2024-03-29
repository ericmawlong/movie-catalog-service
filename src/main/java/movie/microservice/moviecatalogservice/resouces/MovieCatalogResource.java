package movie.microservice.moviecatalogservice.resouces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping ("/catalog")
public class MovieCatalogResource {
    @RequestMapping ("/{userId}")
    public List<CatalogItem> getCatalogItem(@PathVariable("userId") String userId) {

        return Collections.singletonList(
                new CatalogItem("Transformers", "test",  4)
        );
    }
}

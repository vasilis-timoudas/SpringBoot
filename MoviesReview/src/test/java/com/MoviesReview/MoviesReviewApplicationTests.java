package com.MoviesReview;

import com.MoviesReview.controller.MovieController;
import com.MoviesReview.model.Movie;
import com.MoviesReview.service.MovieService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MovieController.class)
@AutoConfigureMockMvc
@SpringBootTest
class MoviesReviewApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private MovieService movieService;
	private Movie movie;

	@BeforeEach
	void setUp() {
		//movie = new Movie(new ObjectId("sampleId"), "sampleImdbId", "Sample Movie", "2022-01-01", "https://sample-trailer-link.com", "https://sample-poster.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
	}

}

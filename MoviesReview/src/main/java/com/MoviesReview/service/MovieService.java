package com.MoviesReview.service;

import com.MoviesReview.model.Movie;
import com.MoviesReview.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String imbdbId){
        return movieRepository.findMovieByImdbId(imbdbId);
    }
}

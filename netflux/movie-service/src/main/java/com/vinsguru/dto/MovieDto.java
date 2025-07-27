package com.vinsguru.dto;

import com.vinsguru.domain.Genre;

// DTO is used for data transfer to hide full entity details

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}

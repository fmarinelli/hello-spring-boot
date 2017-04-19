package io.spring.cloud.samples.fortuneteller.ui.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Fortune {
    private Long id;
    private String text;
}
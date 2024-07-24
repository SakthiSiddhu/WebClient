package com.ust.State.dto;

import com.ust.State.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto
{
    State state;
    List<DistrictDto> districts;

}

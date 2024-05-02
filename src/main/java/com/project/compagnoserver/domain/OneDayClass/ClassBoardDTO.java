package com.project.compagnoserver.domain.OneDayClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClassBoardDTO {

    private int odcCode;
    private String odcTitle;
    private String odcContent;
    private MultipartFile file;
    private String odcStartDate;
    private String odcLastDate;

}

package com.prwatech.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
  private String id;
  private String projectTitle;
  private String projectDescription;
  private String projectBanner;
  private String projectVideo;
}

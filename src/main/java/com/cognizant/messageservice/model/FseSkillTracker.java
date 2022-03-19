package com.cognizant.messageservice.model;

import com.cognizant.messageservice.data.FseDocument;
import com.cognizant.messageservice.data.SkillDocument;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FseSkillTracker implements Serializable {
   private FseDocument fseDocument;
   private  List<SkillDocument> skillDocumentList;
}

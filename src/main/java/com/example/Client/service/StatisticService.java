package com.example.Client.service;

import com.example.Client.entity.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatisticService {

  @Autowired
  private IVisitService iVisitService;

  public Double getTotalValue(){
      List<Visit>listAllVisits = iVisitService.allVisitList();
      int size = listAllVisits.size();
      Double totalValue= 0.0;
      for (Visit listAllVisit : listAllVisits) {
          totalValue += listAllVisit.getTotalPrice();
      }
      return totalValue ;
  }
    public Double getCloseValue(){
        List<Visit>listCloseVisits = iVisitService.getVisitClose();
        int size = listCloseVisits.size();
        Double totalCloseValue= 0.0;
        for (Visit listCloseVisit : listCloseVisits) {
            totalCloseValue += listCloseVisit.getTotalPrice();
        }
        return totalCloseValue ;
    }
}
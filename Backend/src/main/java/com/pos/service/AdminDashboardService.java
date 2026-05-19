package com.pos.service;



import com.pos.payload.AdminAnalysis.DashboardSummaryDTO;
import com.pos.payload.AdminAnalysis.StoreRegistrationStatDTO;
import com.pos.payload.AdminAnalysis.StoreStatusDistributionDTO;


import java.util.List;

public interface AdminDashboardService {

    DashboardSummaryDTO getDashboardSummary();

    List<StoreRegistrationStatDTO> getLast7DayRegistrationStats();

    StoreStatusDistributionDTO getStoreStatusDistribution();
}

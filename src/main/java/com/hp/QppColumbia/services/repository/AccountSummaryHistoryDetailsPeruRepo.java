package com.hp.QppColumbia.services.repository;

import com.hp.QppColumbia.services.dao.AccountSummaryDetailsHistoryPeruDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountSummaryHistoryDetailsPeruRepo extends JpaRepository<AccountSummaryDetailsHistoryPeruDao, Integer> {
    @Query(value = "Select * from account_summary_history_peru where homologatedName = ?1", nativeQuery = true)
    List<AccountSummaryDetailsHistoryPeruDao> findAllRecords(String homologatedName);

    @Query(value = "Select * from account_summary_history_peru", nativeQuery = true)
    List<AccountSummaryDetailsHistoryPeruDao> findAllTheRecords();

}
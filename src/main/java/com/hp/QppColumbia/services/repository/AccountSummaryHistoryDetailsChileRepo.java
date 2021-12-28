package com.hp.QppColumbia.services.repository;

import com.hp.QppColumbia.services.dao.AccountSummaryDetailsHistoryChileDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountSummaryHistoryDetailsChileRepo extends JpaRepository<AccountSummaryDetailsHistoryChileDao, Integer> {

    @Query(value = "Select * from account_summary_history_chile where homologatedName = ?1", nativeQuery = true)
    List<AccountSummaryDetailsHistoryChileDao> findAllRecords(String homologatedName);

    @Query(value = "Select * from account_summary_history_chile", nativeQuery = true)
    List<AccountSummaryDetailsHistoryChileDao> findAllTheRecords();

}
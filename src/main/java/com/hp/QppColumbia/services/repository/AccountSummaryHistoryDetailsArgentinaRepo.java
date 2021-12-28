package com.hp.QppColumbia.services.repository;

import com.hp.QppColumbia.services.dao.AccountSummaryDetailsHistoryArgentinaDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountSummaryHistoryDetailsArgentinaRepo extends JpaRepository<AccountSummaryDetailsHistoryArgentinaDao, Integer> {
    @Query(value = "Select * from account_summary_history_argentina where homologatedName = ?1", nativeQuery = true)
    List<AccountSummaryDetailsHistoryArgentinaDao> findAllRecords(String homologatedName);

    @Query(value = "Select * from account_summary_history_argentina", nativeQuery = true)
    List<AccountSummaryDetailsHistoryArgentinaDao> findAllTheRecords();

}
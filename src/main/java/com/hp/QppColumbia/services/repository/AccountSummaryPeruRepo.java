package com.hp.QppColumbia.services.repository;

import com.hp.QppColumbia.services.dao.AccountSummaryDetailsDao;
import com.hp.QppColumbia.services.dao.AccountSummaryDetailsPeruDao;
import com.hp.QppColumbia.services.dao.AccountSummaryDetailsPeruDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountSummaryPeruRepo extends JpaRepository<AccountSummaryDetailsPeruDao, Integer> {
    @Query(value = "Select * from account_summary_peru", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecords();

    @Query(value = "Select * from account_summary_peru where homologatedName = ?1", nativeQuery = true)
    AccountSummaryDetailsPeruDao findRecordDetails(String homologatedName);

    @Query(value = "Select * from account_summary_peru where homologatedName = ?1", nativeQuery = true)
    Optional<AccountSummaryDetailsPeruDao> findRecordDetailsNew(String homologatedName);

    @Query(value = "Select * from account_summary_peru where homologatedName =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByHN(String HN);

    @Query(value = "Select * from account_summary_peru where homologatedName COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsLikeHN(String HN);

    @Query(value = "Select * from account_summary_peru where razonSocial =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByRazonSocial(String razonSocial);

    @Query(value = "Select * from account_summary_peru where razonSocial COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsLikeRazonSocial(String razonSocial);

    @Query(value = "Select * from account_summary_peru where taxId =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByTaxId(String taxId);

    @Query(value = "Select * from account_summary_peru where taxId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsLikeTaxId(String taxId);

    @Query(value = "Select * from account_summary_peru where locationId =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByLocationId(String locationId);

    @Query(value = "Select * from account_summary_peru where locationId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsLikeLocationId(String locationId);

    @Query(value = "Select * from account_summary_peru where bpsStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByBpsStatus(String bps);

    @Query(value = "Select * from account_summary_peru where hpsHardwareStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByHpsStatus(String hps);

    @Query(value = "Select * from account_summary_peru where opsHardwareStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByOpsStatus(String ops);

    @Query(value = "Select * from account_summary_peru where mpa =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByMPA(String ops);

    @Query(value = "Select * from account_summary_peru where largeFormatStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsByLargeFormatStatus(String lfs);

    @Query(value = "Select * from account_summary_peru where suppliesStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsPeruDao> findAllRecordsBySuppliesStatus(
            String suppliesStatus);

    @Query(value = "Select DISTINCT(homologatedName) from account_summary_peru", nativeQuery = true)
    List<String> findallHM();

    @Query(value = "Select DISTINCT(razonSocial) from account_summary_peru", nativeQuery = true)
    List<String> findallRS();

    @Query(value = "Select DISTINCT(taxId) from account_summary_peru", nativeQuery = true)
    List<String> findallTI();

    @Query(value = "Select DISTINCT(locationId) from account_summary_peru", nativeQuery = true)
    List<String> findallLocationId();

    @Query(value = "Select DISTINCT(suppliesStatus) from account_summary_peru", nativeQuery = true)
    List<String> findallSuppliesStatus();

    @Query(value = "Select DISTINCT(mpa) from account_summary_peru", nativeQuery = true)
    List<String> findAllMPA();

    @Query(value = "Select DISTINCT(largeFormatStatus) from account_summary_peru", nativeQuery = true)
    List<String> findAllLargeFormatStatus();

    @Query(value = "Select DISTINCT(hpsHardwareStatus) from account_summary_peru", nativeQuery = true)
    List<String> findAllHpsHardwareStatus();

    @Query(value = "Select DISTINCT(opsHardwareStatus) from account_summary_peru", nativeQuery = true)
    List<String> findAllOpsHardwareStatus();

    @Query(value = "Select DISTINCT(bpsStatus) from account_summary_peru", nativeQuery = true)
    List<String> findAllBpsStatus();
}
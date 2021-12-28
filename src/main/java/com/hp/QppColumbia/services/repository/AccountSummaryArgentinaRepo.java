package com.hp.QppColumbia.services.repository;

import com.hp.QppColumbia.services.dao.AccountSummaryDetailsArgentinaDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountSummaryArgentinaRepo extends JpaRepository<AccountSummaryDetailsArgentinaDao, Integer> {
    @Query(value = "Select * from account_summary_argentina", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecords();

    @Query(value = "Select * from account_summary_argentina where homologatedName = ?1", nativeQuery = true)
    AccountSummaryDetailsArgentinaDao findRecordDetails(String homologatedName);

    @Query(value = "Select * from account_summary_argentina where homologatedName = ?1", nativeQuery = true)
    Optional<AccountSummaryDetailsArgentinaDao> findRecordDetailsNew(String homologatedName);

    @Query(value = "Select * from account_summary_argentina where homologatedName =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByHN(String HN);

    @Query(value = "Select * from account_summary_argentina where homologatedName COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsLikeHN(String HN);

    @Query(value = "Select * from account_summary_argentina where razonSocial =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByRazonSocial(String razonSocial);

    @Query(value = "Select * from account_summary_argentina where razonSocial COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsLikeRazonSocial(String razonSocial);

    @Query(value = "Select * from account_summary_argentina where taxId =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByTaxId(String taxId);

    @Query(value = "Select * from account_summary_argentina where taxId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsLikeTaxId(String taxId);

    @Query(value = "Select * from account_summary_argentina where locationId =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByLocationId(String locationId);

    @Query(value = "Select * from account_summary_argentina where locationId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsLikeLocationId(String locationId);

    @Query(value = "Select * from account_summary_argentina where bpsStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByBpsStatus(String bps);

    @Query(value = "Select * from account_summary_argentina where hpsHardwareStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByHpsStatus(String hps);

    @Query(value = "Select * from account_summary_argentina where opsHardwareStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByOpsStatus(String ops);

    @Query(value = "Select * from account_summary_argentina where mpa =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByMPA(String ops);

    @Query(value = "Select * from account_summary_argentina where largeFormatStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsByLargeFormatStatus(String lfs);

    @Query(value = "Select * from account_summary_argentina where suppliesStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsArgentinaDao> findAllRecordsBySuppliesStatus(
            String suppliesStatus);

    @Query(value = "Select DISTINCT(homologatedName) from account_summary_argentina", nativeQuery = true)
    List<String> findallHM();

    @Query(value = "Select DISTINCT(razonSocial) from account_summary_argentina", nativeQuery = true)
    List<String> findallRS();

    @Query(value = "Select DISTINCT(taxId) from account_summary_argentina", nativeQuery = true)
    List<String> findallTI();

    @Query(value = "Select DISTINCT(locationId) from account_summary_argentina", nativeQuery = true)
    List<String> findallLocationId();

    @Query(value = "Select DISTINCT(suppliesStatus) from account_summary_argentina", nativeQuery = true)
    List<String> findallSuppliesStatus();

    @Query(value = "Select DISTINCT(mpa) from account_summary_argentina", nativeQuery = true)
    List<String> findAllMPA();

    @Query(value = "Select DISTINCT(largeFormatStatus) from account_summary_argentina", nativeQuery = true)
    List<String> findAllLargeFormatStatus();

    @Query(value = "Select DISTINCT(hpsHardwareStatus) from account_summary_argentina", nativeQuery = true)
    List<String> findAllHpsHardwareStatus();

    @Query(value = "Select DISTINCT(opsHardwareStatus) from account_summary_argentina", nativeQuery = true)
    List<String> findAllOpsHardwareStatus();

    @Query(value = "Select DISTINCT(bpsStatus) from account_summary_argentina", nativeQuery = true)
    List<String> findAllBpsStatus();
}
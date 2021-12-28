package com.hp.QppColumbia.services.repository;

import com.hp.QppColumbia.services.dao.AccountSummaryDetailsChileDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountSummaryChileRepo extends JpaRepository<AccountSummaryDetailsChileDao, Integer> {
    @Query(value = "Select * from account_summary_chile", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecords();

    @Query(value = "Select * from account_summary_chile where homologatedName = ?1", nativeQuery = true)
    AccountSummaryDetailsChileDao findRecordDetails(String homologatedName);

    @Query(value = "Select * from account_summary_chile where homologatedName = ?1", nativeQuery = true)
    Optional<AccountSummaryDetailsChileDao> findRecordDetailsNew(String homologatedName);

    @Query(value = "Select * from account_summary_chile where homologatedName =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByHN(String HN);

    @Query(value = "Select * from account_summary_chile where homologatedName COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsLikeHN(String HN);

    @Query(value = "Select * from account_summary_chile where razonSocial =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByRazonSocial(String razonSocial);

    @Query(value = "Select * from account_summary_chile where razonSocial COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsLikeRazonSocial(String razonSocial);

    @Query(value = "Select * from account_summary_chile where taxId =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByTaxId(String taxId);

    @Query(value = "Select * from account_summary_chile where taxId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsLikeTaxId(String taxId);

    @Query(value = "Select * from account_summary_chile where locationId =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByLocationId(String locationId);

    @Query(value = "Select * from account_summary_chile where locationId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsLikeLocationId(String locationId);

    @Query(value = "Select * from account_summary_chile where bpsStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByBpsStatus(String bps);

    @Query(value = "Select * from account_summary_chile where hpsHardwareStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByHpsStatus(String hps);

    @Query(value = "Select * from account_summary_chile where opsHardwareStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByOpsStatus(String ops);

    @Query(value = "Select * from account_summary_chile where mpa =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByMPA(String ops);

    @Query(value = "Select * from account_summary_chile where largeFormatStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsByLargeFormatStatus(String lfs);

    @Query(value = "Select * from account_summary_chile where suppliesStatus =?1", nativeQuery = true)
    List<AccountSummaryDetailsChileDao> findAllRecordsBySuppliesStatus(
            String suppliesStatus);

    @Query(value = "Select DISTINCT(homologatedName) from account_summary_chile", nativeQuery = true)
    List<String> findallHM();

    @Query(value = "Select DISTINCT(razonSocial) from account_summary_chile", nativeQuery = true)
    List<String> findallRS();

    @Query(value = "Select DISTINCT(taxId) from account_summary_chile", nativeQuery = true)
    List<String> findallTI();

    @Query(value = "Select DISTINCT(locationId) from account_summary_chile", nativeQuery = true)
    List<String> findallLocationId();

    @Query(value = "Select DISTINCT(suppliesStatus) from account_summary_chile", nativeQuery = true)
    List<String> findallSuppliesStatus();

    @Query(value = "Select DISTINCT(mpa) from account_summary_chile", nativeQuery = true)
    List<String> findAllMPA();

    @Query(value = "Select DISTINCT(largeFormatStatus) from account_summary_chile", nativeQuery = true)
    List<String> findAllLargeFormatStatus();

    @Query(value = "Select DISTINCT(hpsHardwareStatus) from account_summary_chile", nativeQuery = true)
    List<String> findAllHpsHardwareStatus();

    @Query(value = "Select DISTINCT(opsHardwareStatus) from account_summary_chile", nativeQuery = true)
    List<String> findAllOpsHardwareStatus();

    @Query(value = "Select DISTINCT(bpsStatus) from account_summary_chile", nativeQuery = true)
    List<String> findAllBpsStatus();
}
package com.github.gregwhitaker.dbmigrator.table;

import com.github.gregwhitaker.dbmigrator.util.DatabaseTableTest;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Tests for the "metadata" table.
 */
@DatabaseTableTest(
    tableName = "metadata"
)
public class MetadataTableIntegrationTest extends BaseTableIntegrationTest {
  public static final String TABLE_NAME = "metadata";

  private static final Map<String, BaseTableIntegrationTest.ExpectedColumnInformation> EXPECTED_COLUMNS = new LinkedHashMap<>();

  static {
    EXPECTED_COLUMNS.put("id", new ExpectedColumnInformation("int8", false, "nextval('metadata_id_seq'::regclass)"));
    EXPECTED_COLUMNS.put("metadata_value", new ExpectedColumnInformation("varchar", false));
    EXPECTED_COLUMNS.put("metadata_type", new ExpectedColumnInformation("int4", false));
    EXPECTED_COLUMNS.put("modified_on", new ExpectedColumnInformation("timestamp", false, "CURRENT_TIMESTAMP"));
  }

  public MetadataTableIntegrationTest() {
    super(TABLE_NAME, EXPECTED_COLUMNS);
  }
}

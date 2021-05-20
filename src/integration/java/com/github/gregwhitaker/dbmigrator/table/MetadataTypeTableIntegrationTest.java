package com.github.gregwhitaker.dbmigrator.table;

import com.github.gregwhitaker.dbmigrator.util.DatabaseTableTest;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Tests for the "metadata_type" table.
 */
@DatabaseTableTest(
    tableName = "metadata_type"
)
public class MetadataTypeTableIntegrationTest extends BaseTableIntegrationTest {
  public static final String TABLE_NAME = "metadata_type";

  private static final Map<String, BaseTableIntegrationTest.ExpectedColumnInformation> EXPECTED_COLUMNS = new LinkedHashMap<>();

  static {
    EXPECTED_COLUMNS.put("id", new ExpectedColumnInformation("int8", false, "nextval('metadata_type_id_seq'::regclass)"));
    EXPECTED_COLUMNS.put("type_name", new ExpectedColumnInformation("varchar", false));
    EXPECTED_COLUMNS.put("type_value", new ExpectedColumnInformation("varchar", false));
  }

  public MetadataTypeTableIntegrationTest() {
    super(TABLE_NAME, EXPECTED_COLUMNS);
  }
}

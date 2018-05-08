/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */

package org.elasticsearch.xpack.qa.sql.nosecurity;

import org.elasticsearch.xpack.qa.sql.geo.GeoSqlSpecTestCase;

public class GeoJdbcSqlSpecIT extends GeoSqlSpecTestCase {
    public GeoJdbcSqlSpecIT(String fileName, String groupName, String testName, Integer lineNumber, String query) {
        super(fileName, groupName, testName, lineNumber, query);
    }
}

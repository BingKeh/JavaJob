package com.morhop.job.framework;

import javax.sql.DataSource;

public interface DataSourceFactory {
    DataSource getDataSource(String url, String user, String password);
}

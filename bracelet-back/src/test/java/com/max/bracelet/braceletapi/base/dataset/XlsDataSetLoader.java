package com.max.bracelet.braceletapi.base.dataset;

import java.io.InputStream;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.excel.XlsDataSet;
import org.springframework.core.io.Resource;

import com.github.springtestdbunit.dataset.AbstractDataSetLoader;

public class XlsDataSetLoader extends AbstractDataSetLoader {

	@Override
	protected IDataSet createDataSet(Resource resource) throws Exception {
		InputStream inputStream = resource.getInputStream();
		try {
			return new XlsDataSet(inputStream);
		} finally {
			inputStream.close();
		}
	}

}

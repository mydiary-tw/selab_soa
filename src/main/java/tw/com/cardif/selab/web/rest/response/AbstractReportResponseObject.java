/**
 * 
 */
package tw.com.cardif.selab.web.rest.response;

import java.util.Properties;

/**
 * Html Response 抽象物件（含動態報表輸入）
 * 
 * @author Rise Liu
 *
 */
public abstract class AbstractReportResponseObject extends AbstractResponseObject implements IReportResponseObject {

	private Properties reportProps; // 報表參數

	public Properties getReportProps() {
		return reportProps;
	}

}

/**
 * 
 */
package tw.com.cardif.selab.web.rest.response;

import java.util.Properties;

/**
 * @author Rise Liu
 *
 */
public abstract class AbstractReportResponseObject extends AbstractResponseObject implements IReportResponseObject {

	private Properties reportProps;

	public Properties getReportProps() {
		return reportProps;
	}

}

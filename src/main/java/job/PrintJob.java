package job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created with IntelliJ IDEA.
 * User: yuchen.yang
 * Date: 14-4-10
 * Time: 下午2:31
 * To change this template use File | Settings | File Templates.
 */
public class PrintJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("无意义的Job执行中...");
    }
}

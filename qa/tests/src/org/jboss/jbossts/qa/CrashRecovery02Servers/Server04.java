/*
 * SPDX short identifier: Apache-2.0
 */


package org.jboss.jbossts.qa.CrashRecovery02Servers;



/*
 * Try to get around the differences between Ansi CPP and
 * K&R cpp with concatenation.
 */




import org.jboss.jbossts.qa.CrashRecovery02.*;
import org.jboss.jbossts.qa.CrashRecovery02Impls.AfterCrashServiceImpl01;
import org.jboss.jbossts.qa.Utils.OAInterface;
import org.jboss.jbossts.qa.Utils.ORBInterface;
import org.jboss.jbossts.qa.Utils.ServerIORStore;

public class Server04
{
	public static void main(String args[])
	{
		try
		{
			ORBInterface.initORB(args, null);
			OAInterface.initOA();

			AfterCrashServiceImpl01 afterCrashServiceImpl1 = new AfterCrashServiceImpl01(args[args.length - 3].hashCode(), 0);
			AfterCrashServiceImpl01 afterCrashServiceImpl2 = new AfterCrashServiceImpl01(args[args.length - 3].hashCode(), 1);

			AfterCrashServicePOATie servant1 = new AfterCrashServicePOATie(afterCrashServiceImpl1);
			AfterCrashServicePOATie servant2 = new AfterCrashServicePOATie(afterCrashServiceImpl2);

			OAInterface.objectIsReady(servant1);
			AfterCrashService afterCrashService1 = AfterCrashServiceHelper.narrow(OAInterface.corbaReference(servant1));

			OAInterface.objectIsReady(servant2);
			AfterCrashService afterCrashService2 = AfterCrashServiceHelper.narrow(OAInterface.corbaReference(servant2));

			ServerIORStore.storeIOR(args[args.length - 2], ORBInterface.orb().object_to_string(afterCrashService1));
			ServerIORStore.storeIOR(args[args.length - 1], ORBInterface.orb().object_to_string(afterCrashService2));

			System.out.println("Ready");

			ORBInterface.run();
		}
		catch (Exception exception)
		{
			System.err.println("Server04.main: " + exception);
			exception.printStackTrace(System.err);
		}
	}
}
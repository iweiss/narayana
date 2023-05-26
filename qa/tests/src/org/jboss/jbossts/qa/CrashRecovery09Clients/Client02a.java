/*
 * SPDX short identifier: Apache-2.0
 */


package org.jboss.jbossts.qa.CrashRecovery09Clients;



/*
 * Try to get around the differences between Ansi CPP and
 * K&R cpp with concatenation.
 */




import org.jboss.jbossts.qa.CrashRecovery09.*;
import org.jboss.jbossts.qa.Utils.*;
import org.omg.CORBA.IntHolder;

public class Client02a
{
	public static void main(String[] args)
	{
		try
		{
			ORBInterface.initORB(args, null);
			OAInterface.initOA();

			String serviceIOR = ServerIORStore.loadIOR(args[args.length - 1]);
			Service service = ServiceHelper.narrow(ORBInterface.orb().string_to_object(serviceIOR));

			CrashRecoveryDelays.awaitRecoveryCR09();

			boolean correct = true;

			OTS.current().begin();

			IntHolder valueHolder = new IntHolder();
			service.get(valueHolder);
			correct = correct && (valueHolder.value == 0);

			OTS.current().commit(true);

			if (correct)
			{
				System.out.println("Passed");
			}
			else
			{
				System.out.println("Failed");
			}
		}
		catch (Exception exception)
		{
			System.out.println("Failed");
			System.err.println("Client02a.main: " + exception);
			exception.printStackTrace(System.err);
		}

		try
		{
			OAInterface.shutdownOA();
			ORBInterface.shutdownORB();
		}
		catch (Exception exception)
		{
			System.err.println("Client02a.main: " + exception);
			exception.printStackTrace(System.err);
		}
	}
}
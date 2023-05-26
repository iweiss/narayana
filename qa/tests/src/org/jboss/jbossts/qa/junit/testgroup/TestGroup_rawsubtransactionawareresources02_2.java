/*
 * SPDX short identifier: Apache-2.0
 */

package org.jboss.jbossts.qa.junit.testgroup;

import org.jboss.jbossts.qa.junit.*;
import org.junit.*;

// Automatically generated by XML2JUnit
public class TestGroup_rawsubtransactionawareresources02_2 extends TestGroupBase
{
	public String getTestGroupName()
	{
		return "rawsubtransactionawareresources02_2";
	}

	protected Task server0 = null;

	@Before public void setUp()
	{
		super.setUp();
		server0 = createTask("server0", com.arjuna.ats.arjuna.recovery.RecoveryManager.class, Task.TaskType.EXPECT_READY, 480);
		server0.start("-test");
	}

	@After public void tearDown()
	{
		try {
			server0.terminate();
		Task task0 = createTask("task0", org.jboss.jbossts.qa.Utils.RemoveServerIORStore.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		task0.perform("$(1)", "$(2)");
		} finally {
			super.tearDown();
		}
	}

	@Test public void RawSubtransactionAwareResources02_2_Test001()
	{
		setTestName("Test001");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)", "$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client001.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test002()
	{
		setTestName("Test002");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)", "$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client002.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test003()
	{
		setTestName("Test003");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)", "$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client003.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test004()
	{
		setTestName("Test004");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)", "$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client004.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test005()
	{
		setTestName("Test005");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server02.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)", "$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client005.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test006()
	{
		setTestName("Test006");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)");
		Task server2 = createTask("server2", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server2.start("$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client001.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server2.terminate();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test007()
	{
		setTestName("Test007");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)");
		Task server2 = createTask("server2", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server2.start("$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client002.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server2.terminate();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test008()
	{
		setTestName("Test008");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)");
		Task server2 = createTask("server2", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server2.start("$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client003.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server2.terminate();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test009()
	{
		setTestName("Test009");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)");
		Task server2 = createTask("server2", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server2.start("$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client004.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server2.terminate();
		server1.terminate();
	}

	@Test public void RawSubtransactionAwareResources02_2_Test010()
	{
		setTestName("Test010");
		Task server1 = createTask("server1", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server1.start("$(1)");
		Task server2 = createTask("server2", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Servers.Server01.class, Task.TaskType.EXPECT_READY, 480);
		server2.start("$(2)");
		Task client0 = createTask("client0", org.jboss.jbossts.qa.RawSubtransactionAwareResources02Clients2.Client005.class, Task.TaskType.EXPECT_PASS_FAIL, 480);
		client0.start("$(1)", "$(2)");
		client0.waitFor();
		server2.terminate();
		server1.terminate();
	}

}
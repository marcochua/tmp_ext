package tooltwist.rpbsg.util;

import com.dinaa.DinaaException;
import com.dinaa.data.XData;
import com.dinaa.xpc.Xpc;
import com.dinaa.xpc.XpcException;
import com.dinaa.xpc.XpcSecurity;

public class XpcBsg extends Xpc {
	

	public XpcBsg(XpcCall xpcCall, XpcSecurity xpcSecurity) throws XpcException {
		super(xpcSecurity);
		this.start(xpcCall.getXpcName(), xpcCall.getXpcMethod());
	}
	
}



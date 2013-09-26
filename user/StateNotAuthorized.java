package user;

import base.Frontend;
import base.LongId;
import frontend.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: korolkov
 * Date: 8/18/13
 * Time: 11:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class StateNotAuthorized implements UserState {


    public void processUserState( Frontend frontend, LongId<UserSession> sessionId,
                                  HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.getWriter().print( Page.NotAuthorized(sessionId, frontend.getUserSessionBySessionId(sessionId).getUserName()));
        frontend.removeSession(sessionId);
    }
}

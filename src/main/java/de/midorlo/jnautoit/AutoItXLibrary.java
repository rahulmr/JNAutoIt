/*
 * Copyright 2018 midorlo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.midorlo.jnautoit;

import com.sun.jna.Library;
import com.sun.jna.platform.win32.WTypes.LPWSTR;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HWND;

/**
 *
 * @author midorlo
 */
public interface AutoItXLibrary extends Library {

//    com.sun.jna.platform.win32.WinDef.HWND x;
    
    String AU3_WinMinimizeAll();

    void AU3_Init();

    int AU3_error();

    int AU3_AutoItSetOption(LPCWSTR szOption, int nValue);

    void AU3_ClipGet(LPWSTR szClip, int nBufSize);

    void AU3_ClipPut(LPCWSTR szClip);

//        int AU3_ControlClick(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPCWSTR szButton, int nNumClicks, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT
//
//        );
//        int AU3_ControlClickByHandle(HWND hWnd, HWND hCtrl, LPCWSTR szButton, int nNumClicks, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT
//
//        );
    void AU3_ControlCommand(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPCWSTR szCommand, LPCWSTR szExtra, LPWSTR szResult, int nBufSize);

    void AU3_ControlCommandByHandle(HWND hWnd, HWND hCtrl, LPCWSTR szCommand, LPCWSTR szExtra, LPWSTR szResult, int nBufSize);

    void AU3_ControlListView(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPCWSTR szCommand, LPCWSTR szExtra1, LPCWSTR szExtra2, LPWSTR szResult, int nBufSize);

    void AU3_ControlListViewByHandle(HWND hWnd, HWND hCtrl, LPCWSTR szCommand, LPCWSTR szExtra1, LPCWSTR szExtra2, LPWSTR szResult, int nBufSize);

    int AU3_ControlDisable(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl);

    int AU3_ControlDisableByHandle(HWND hWnd, HWND hCtrl);

    int AU3_ControlEnable(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl);

    int AU3_ControlEnableByHandle(HWND hWnd, HWND hCtrl);

    int AU3_ControlFocus(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl);

    int AU3_ControlFocusByHandle(HWND hWnd, HWND hCtrl);

    void AU3_ControlGetFocus(LPCWSTR szTitle, LPCWSTR szText, LPWSTR szControlWithFocus, int nBufSize);

    void AU3_ControlGetFocusByHandle(HWND hWnd, LPWSTR szControlWithFocus, int nBufSize);

    HWND AU3_ControlGetHandle(HWND hWnd, LPCWSTR szControl);

    void AU3_ControlGetHandleAsText(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPCWSTR szControl, LPWSTR szRetText, int nBufSize);

    int AU3_ControlGetPos(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPRECT lpRect);

    int AU3_ControlGetPosByHandle(HWND hWnd, HWND hCtrl, LPRECT lpRect);

    void AU3_ControlGetText(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPWSTR szControlText, int nBufSize);

    void AU3_ControlGetTextByHandle(HWND hWnd, HWND hCtrl, LPWSTR szControlText, int nBufSize);

    int AU3_ControlHide(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl);

    int AU3_ControlHideByHandle(HWND hWnd, HWND hCtrl);

//        int AU3_ControlMove(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, int nX, int nY, int nWidth
//        = -1, int nHeight = -1
//
//        );
//        int AU3_ControlMoveByHandle(HWND hWnd, HWND hCtrl, int nX, int nY, int nWidth
//        = -1, int nHeight = -1
//
//        );
//        int AU3_ControlSend(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPCWSTR szSendText, int nMode
//
//        = 0);
//        int AU3_ControlSendByHandle(HWND hWnd, HWND hCtrl, LPCWSTR szSendText, int nMode
//
//        = 0);
    int AU3_ControlSetText(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPCWSTR szControlText);

    int AU3_ControlSetTextByHandle(HWND hWnd, HWND hCtrl, LPCWSTR szControlText);

    int AU3_ControlShow(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl);

    int AU3_ControlShowByHandle(HWND hWnd, HWND hCtrl);

    void AU3_ControlTreeView(LPCWSTR szTitle, LPCWSTR szText, LPCWSTR szControl, LPCWSTR szCommand, LPCWSTR szExtra1, LPCWSTR szExtra2, LPWSTR szResult, int nBufSize);

    void AU3_ControlTreeViewByHandle(HWND hWnd, HWND hCtrl, LPCWSTR szCommand, LPCWSTR szExtra1, LPCWSTR szExtra2, LPWSTR szResult, int nBufSize);

    void AU3_DriveMapAdd(LPCWSTR szDevice, LPCWSTR szShare, int nFlags, /*[in,defaultvalue("")]*/ LPCWSTR szUser, /*[in,defaultvalue("")]*/ LPCWSTR szPwd, LPWSTR szResult, int nBufSize);

    int AU3_DriveMapDel(LPCWSTR szDevice);

    void AU3_DriveMapGet(LPCWSTR szDevice, LPWSTR szMapping, int nBufSize);

    int AU3_IsAdmin();

//        int AU3_MouseClick(/*[in,defaultvalue("LEFT")]*/LPCWSTR szButton, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT, int nClicks = 1, int nSpeed = -1
//
//        );
//        int AU3_MouseClickDrag(LPCWSTR szButton, int nX1, int nY1, int nX2, int nY2, int nSpeed
//        = -1);
    void AU3_MouseDown(/*[in,defaultvalue("LEFT")]*/LPCWSTR szButton);

    int AU3_MouseGetCursor();

//        void AU3_MouseGetPos(LPPOINT lpPoint);
//
//        int AU3_MouseMove(int nX, int nY, int nSpeed
//
//        = -1);
    void AU3_MouseUp(/*[in,defaultvalue("LEFT")]*/LPCWSTR szButton);

    void AU3_MouseWheel(LPCWSTR szDirection, int nClicks);

    int AU3_Opt(LPCWSTR szOption, int nValue);

//        unsigned
//
//        int AU3_PixelChecksum(LPRECT lpRect, int nStep
//
//        = 1);
    int AU3_PixelGetColor(int nX, int nY);

    void AU3_PixelSearch(LPRECT lpRect, int nCol, /*default 0*/ int nVar, /*default 1*/ int nStep, LPPOINT pPointResult);

    int AU3_ProcessClose(LPCWSTR szProcess);

    int AU3_ProcessExists(LPCWSTR szProcess);

    int AU3_ProcessSetPriority(LPCWSTR szProcess, int nPriority);

//        int AU3_ProcessWait(LPCWSTR szProcess, int nTimeout
//
//        = 0);
//        int AU3_ProcessWaitClose(LPCWSTR szProcess, int nTimeout
//
//        = 0);
//
//        int AU3_Run(LPCWSTR szProgram, /*[in,defaultvalue("")]*/ LPCWSTR szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//        int AU3_RunWait(LPCWSTR szProgram, /*[in,defaultvalue("")]*/ LPCWSTR szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//        int AU3_RunAs(LPCWSTR szUser, LPCWSTR szDomain, LPCWSTR szPassword, int nLogonFlag, LPCWSTR szProgram, /*[in,defaultvalue("")]*/ LPCWSTR szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//        int AU3_RunAsWait(LPCWSTR szUser, LPCWSTR szDomain, LPCWSTR szPassword, int nLogonFlag, LPCWSTR szProgram, /*[in,defaultvalue("")]*/ LPCWSTR szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//
//        void AU3_Send(LPCWSTR szSendText, int nMode
//
//        = 0);
    int AU3_Shutdown(int nFlags);

    void AU3_Sleep(int nMilliseconds);

    int AU3_StatusbarGetText(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, /*[in,defaultvalue(1)]*/ int nPart, LPWSTR szStatusText, int nBufSize);

    int AU3_StatusbarGetTextByHandle(HWND hWnd, /*[in,defaultvalue(1)]*/ int nPart, LPWSTR szStatusText, int nBufSize);

//        void AU3_ToolTip(LPCWSTR szTip, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT
//
//        );
    int AU3_WinActivate(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    int AU3_WinActivateByHandle(HWND hWnd);

    int AU3_WinActive(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    int AU3_WinActiveByHandle(HWND hWnd);

    int AU3_WinClose(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    int AU3_WinCloseByHandle(HWND hWnd);

    int AU3_WinExists(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    int AU3_WinExistsByHandle(HWND hWnd);

    int AU3_WinGetCaretPos(LPPOINT lpPoint);

    void AU3_WinGetClassList(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetClassListByHandle(HWND hWnd, LPWSTR szRetText, int nBufSize);

    int AU3_WinGetClientSize(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPRECT lpRect);

    int AU3_WinGetClientSizeByHandle(HWND hWnd, LPRECT lpRect);

    HWND AU3_WinGetHandle(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    void AU3_WinGetHandleAsText(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPWSTR szRetText, int nBufSize);

    int AU3_WinGetPos(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPRECT lpRect);

    int AU3_WinGetPosByHandle(HWND hWnd, LPRECT lpRect);

    DWORD AU3_WinGetProcess(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    DWORD AU3_WinGetProcessByHandle(HWND hWnd);

    int AU3_WinGetState(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    int AU3_WinGetStateByHandle(HWND hWnd);

    void AU3_WinGetText(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetTextByHandle(HWND hWnd, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetTitle(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetTitleByHandle(HWND hWnd, LPWSTR szRetText, int nBufSize);

    int AU3_WinKill(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText);

    int AU3_WinKillByHandle(HWND hWnd);

    int AU3_WinMenuSelectItem(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, LPCWSTR szItem1, LPCWSTR szItem2, LPCWSTR szItem3, LPCWSTR szItem4, LPCWSTR szItem5, LPCWSTR szItem6, LPCWSTR szItem7, LPCWSTR szItem8);

    int AU3_WinMenuSelectItemByHandle(HWND hWnd, LPCWSTR szItem1, LPCWSTR szItem2, LPCWSTR szItem3, LPCWSTR szItem4, LPCWSTR szItem5, LPCWSTR szItem6, LPCWSTR szItem7, LPCWSTR szItem8);

//        void AU3_WinMinimizeAll();
//
//        void AU3_WinMinimizeAllUndo();
//
//        int AU3_WinMove(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nX, int nY, int nWidth
//        = -1, int nHeight = -1
//
//        );
//        int AU3_WinMoveByHandle(HWND hWnd, int nX, int nY, int nWidth, int nHeight = -1
//
//        );
    int AU3_WinSetOnTop(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nFlag);

    int AU3_WinSetOnTopByHandle(HWND hWnd, int nFlag);

    int AU3_WinSetState(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nFlags);

    int AU3_WinSetStateByHandle(HWND hWnd, int nFlags);

    int AU3_WinSetTitle(LPCWSTR szTitle,LPCWSTR szTitledefaultvalue, LPCWSTR szText, LPCWSTR szNewTitle);
    
    default int AU3_WinSetTitle(LPCWSTR szTitle,LPCWSTR szText, LPCWSTR szNewTitle) {
        
        return AU3_WinSetTitle( szTitle,null,  szText, szNewTitle);
    }

    int AU3_WinSetTitleByHandle(HWND hWnd, LPCWSTR szNewTitle);

    int AU3_WinSetTrans(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nTrans);

    int AU3_WinSetTransByHandle(HWND hWnd, int nTrans);

//        int AU3_WinWait(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nTimeout);
//
//        = 0);
//        int AU3_WinWaitByHandle(HWND hWnd, int nTimeout);
//
//        int AU3_WinWaitActive(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nTimeout);
//
//        = 0);
//        int AU3_WinWaitActiveByHandle(HWND hWnd, int nTimeout);
//
//        int AU3_WinWaitClose(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nTimeout);
//
//        = 0);
    int AU3_WinWaitCloseByHandle(HWND hWnd, int nTimeout);

    int AU3_WinWaitNotActive(LPCWSTR szTitle, /*[in,defaultvalue("")]*/ LPCWSTR szText, int nTimeout);
}


class LPCWSTR {
    //WString
}
//
//class LPWSTR {
////WString
//}

//class HWND {
//
//}

class LPRECT {

}

//class DWORD {
//
//}
//
class LPPOINT {

}

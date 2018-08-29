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

import com.sun.jna.platform.win32.WTypes.LPWSTR;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.WString;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.RECT;


/**
 *
 * @author midorlo
 */
public class AutoItX {

    final AutoItXLibrary LIB;
    private static AutoItX INSTANCE;

    AutoItX() {
        LIB = (AutoItXLibrary) Native.loadLibrary(("AutoItX3_x64.dll"), AutoItXLibrary.class);
        LIB.AU3_Init();
        INSTANCE = this;
    }
    
    public static AutoItX getInstance() {
        return (null == INSTANCE) ? new AutoItX() : INSTANCE;
    }

    public int AU3_ProcessSetPriority(WString arg0, int arg1) {
        return LIB.AU3_ProcessSetPriority(arg0, arg1);
    }

    public void AU3_Init() {
        LIB.AU3_Init();
    }

    public int AU3_IsAdmin() {
        return LIB.AU3_IsAdmin();
    }

    public void AU3_ControlGetFocus(WString arg0, WString arg1, LPWSTR arg2, int arg3) {
        LIB.AU3_ControlGetFocus(arg0, arg1, arg2, arg3);
    }

    public int AU3_MouseGetCursor() {
        return LIB.AU3_MouseGetCursor();
    }

    public int AU3_PixelGetColor(int arg0, int arg1) {
        return LIB.AU3_PixelGetColor(arg0, arg1);
    }
    
    public int AU3_WinClose(String szTitle, String szText) {
        return LIB.AU3_WinClose(szTitle, szText);
    }

    public int AU3_ProcessExists(WString arg0) {
        return LIB.AU3_ProcessExists(arg0);
    }

    public void AU3_ControlListViewByHandle(HWND arg0, HWND arg1, WString arg2, WString arg3, WString arg4, LPWSTR arg5, int arg6) {
        LIB.AU3_ControlListViewByHandle(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int AU3_ControlHideByHandle(HWND arg0, HWND arg1) {
        return LIB.AU3_ControlHideByHandle(arg0, arg1);
    }

    public int AU3_AutoItSetOption(WString arg0, int arg1) {
        return LIB.AU3_AutoItSetOption(arg0, arg1);
    }

    public int AU3_ControlEnable(WString arg0, WString arg1, WString arg2) {
        return LIB.AU3_ControlEnable(arg0, arg1, arg2);
    }

    public int AU3_ControlSetText(WString arg0, WString arg1, WString arg2, WString arg3) {
        return LIB.AU3_ControlSetText(arg0, arg1, arg2, arg3);
    }

    public int AU3_ControlEnableByHandle(HWND arg0, HWND arg1) {
        return LIB.AU3_ControlEnableByHandle(arg0, arg1);
    }

    public void AU3_ControlGetFocusByHandle(HWND arg0, LPWSTR arg1, int arg2) {
        LIB.AU3_ControlGetFocusByHandle(arg0, arg1, arg2);
    }

    public int AU3_ControlShowByHandle(HWND arg0, HWND arg1) {
        return LIB.AU3_ControlShowByHandle(arg0, arg1);
    }

    public void AU3_ControlTreeView(WString arg0, WString arg1, WString arg2, WString arg3, WString arg4, WString arg5, LPWSTR arg6, int arg7) {
        LIB.AU3_ControlTreeView(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public String AU3_WinMinimizeAll() {
        return LIB.AU3_WinMinimizeAll();
    }

    public int AU3_ControlFocusByHandle(HWND arg0, HWND arg1) {
        return LIB.AU3_ControlFocusByHandle(arg0, arg1);
    }

    public void AU3_ControlCommandByHandle(HWND arg0, HWND arg1, WString arg2, WString arg3, LPWSTR arg4, int arg5) {
        LIB.AU3_ControlCommandByHandle(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void AU3_ControlGetTextByHandle(HWND arg0, HWND arg1, LPWSTR arg2, int arg3) {
        LIB.AU3_ControlGetTextByHandle(arg0, arg1, arg2, arg3);
    }

    public void AU3_ControlGetHandleAsText(WString arg0, WString arg1, WString arg2, LPWSTR arg3, int arg4) {
        LIB.AU3_ControlGetHandleAsText(arg0, arg1, arg2, arg3, arg4);
    }

    public int AU3_ControlGetPos(WString arg0, WString arg1, WString arg2, RECT arg3) {
        return LIB.AU3_ControlGetPos(arg0, arg1, arg2, arg3);
    }

    public void AU3_ControlListView(WString arg0, WString arg1, WString arg2, WString arg3, WString arg4, WString arg5, LPWSTR arg6, int arg7) {
        LIB.AU3_ControlListView(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public void AU3_ControlCommand(WString arg0, WString arg1, WString arg2, WString arg3, WString arg4, LPWSTR arg5, int arg6) {
        LIB.AU3_ControlCommand(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public HWND AU3_ControlGetHandle(HWND arg0, WString arg1) {
        return LIB.AU3_ControlGetHandle(arg0, arg1);
    }

    public int AU3_ControlDisable(WString arg0, WString arg1, WString arg2) {
        return LIB.AU3_ControlDisable(arg0, arg1, arg2);
    }

    public int AU3_ControlGetPosByHandle(HWND arg0, HWND arg1, RECT arg2) {
        return LIB.AU3_ControlGetPosByHandle(arg0, arg1, arg2);
    }

    public void AU3_ControlGetText(WString arg0, WString arg1, WString arg2, LPWSTR arg3, int arg4) {
        LIB.AU3_ControlGetText(arg0, arg1, arg2, arg3, arg4);
    }

    public int AU3_ControlSetTextByHandle(HWND arg0, HWND arg1, WString arg2) {
        return LIB.AU3_ControlSetTextByHandle(arg0, arg1, arg2);
    }

    public int AU3_ControlDisableByHandle(HWND arg0, HWND arg1) {
        return LIB.AU3_ControlDisableByHandle(arg0, arg1);
    }

    public void AU3_ControlTreeViewByHandle(HWND arg0, HWND arg1, WString arg2, WString arg3, WString arg4, LPWSTR arg5, int arg6) {
        LIB.AU3_ControlTreeViewByHandle(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int AU3_error() {
        return LIB.AU3_error();
    }

    public void AU3_MouseWheel(WString arg0, int arg1) {
        LIB.AU3_MouseWheel(arg0, arg1);
    }

    public void AU3_DriveMapGet(WString arg0, LPWSTR arg1, int arg2) {
        LIB.AU3_DriveMapGet(arg0, arg1, arg2);
    }

    public int AU3_DriveMapDel(WString arg0) {
        return LIB.AU3_DriveMapDel(arg0);
    }

    public int AU3_WinActive(WString arg0, WString arg1) {
        return LIB.AU3_WinActive(arg0, arg1);
    }

    public int AU3_WinExists(WString arg0, WString arg1) {
        return LIB.AU3_WinExists(arg0, arg1);
    }

    public HWND AU3_WinGetHandle(WString arg0, WString arg1) {
        return LIB.AU3_WinGetHandle(arg0, arg1);
    }

    public void AU3_ClipGet(LPWSTR arg0, int arg1) {
        LIB.AU3_ClipGet(arg0, arg1);
    }

    public void AU3_MouseDown(WString arg0) {
        LIB.AU3_MouseDown(arg0);
    }

    public int AU3_ControlHide(WString arg0, WString arg1, WString arg2) {
        return LIB.AU3_ControlHide(arg0, arg1, arg2);
    }

    public int AU3_ControlFocus(WString arg0, WString arg1, WString arg2) {
        return LIB.AU3_ControlFocus(arg0, arg1, arg2);
    }

    public void AU3_DriveMapAdd(WString arg0, WString arg1, int arg2, WString arg3, WString arg4, LPWSTR arg5, int arg6) {
        LIB.AU3_DriveMapAdd(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int AU3_Opt(WString arg0, int arg1) {
        return LIB.AU3_Opt(arg0, arg1);
    }

    public void AU3_MouseUp(WString arg0) {
        LIB.AU3_MouseUp(arg0);
    }

    public void AU3_PixelSearch(RECT arg0, int arg1, int arg2, int arg3, Pointer arg4) {
        LIB.AU3_PixelSearch(arg0, arg1, arg2, arg3, arg4);
    }

    public void AU3_ClipPut(WString arg0) {
        LIB.AU3_ClipPut(arg0);
    }

    public int AU3_ProcessClose(WString arg0) {
        return LIB.AU3_ProcessClose(arg0);
    }

    public int AU3_Shutdown(int arg0) {
        return LIB.AU3_Shutdown(arg0);
    }

    public void AU3_Sleep(int arg0) {
        LIB.AU3_Sleep(arg0);
    }

    public int AU3_WinActivate(WString arg0, WString arg1) {
        return LIB.AU3_WinActivate(arg0, arg1);
    }

//    public int AU3_WinClose(WString arg0, WString arg1) {
//        return LIB.AU3_WinClose(arg0, arg1);
//    }

    public int AU3_ControlShow(WString arg0, WString arg1, WString arg2) {
        return LIB.AU3_ControlShow(arg0, arg1, arg2);
    }

    public int AU3_WinSetStateByHandle(HWND arg0, int arg1) {
        return LIB.AU3_WinSetStateByHandle(arg0, arg1);
    }

    public int AU3_WinMenuSelectItemByHandle(HWND arg0, WString arg1, WString arg2, WString arg3, WString arg4, WString arg5, WString arg6, WString arg7, WString arg8) {
        return LIB.AU3_WinMenuSelectItemByHandle(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public int AU3_WinMenuSelectItem(WString arg0, WString arg1, WString arg2, WString arg3, WString arg4, WString arg5, WString arg6, WString arg7, WString arg8, WString arg9) {
        return LIB.AU3_WinMenuSelectItem(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public int AU3_WinSetOnTopByHandle(HWND arg0, int arg1) {
        return LIB.AU3_WinSetOnTopByHandle(arg0, arg1);
    }

    public int AU3_WinWaitNotActive(WString arg0, WString arg1, int arg2) {
        return LIB.AU3_WinWaitNotActive(arg0, arg1, arg2);
    }

    public int AU3_WinWaitCloseByHandle(HWND arg0, int arg1) {
        return LIB.AU3_WinWaitCloseByHandle(arg0, arg1);
    }

    public int AU3_WinSetTransByHandle(HWND arg0, int arg1) {
        return LIB.AU3_WinSetTransByHandle(arg0, arg1);
    }

    public int AU3_WinKillByHandle(HWND arg0) {
        return LIB.AU3_WinKillByHandle(arg0);
    }

    public int AU3_WinSetTitleByHandle(HWND arg0, WString arg1) {
        return LIB.AU3_WinSetTitleByHandle(arg0, arg1);
    }

    public int AU3_WinGetClientSize(WString arg0, WString arg1, RECT arg2) {
        return LIB.AU3_WinGetClientSize(arg0, arg1, arg2);
    }

    public int AU3_WinGetPosByHandle(HWND arg0, RECT arg1) {
        return LIB.AU3_WinGetPosByHandle(arg0, arg1);
    }

    public DWORD AU3_WinGetProcessByHandle(HWND arg0) {
        return LIB.AU3_WinGetProcessByHandle(arg0);
    }

    public void AU3_WinGetTextByHandle(HWND arg0, LPWSTR arg1, int arg2) {
        LIB.AU3_WinGetTextByHandle(arg0, arg1, arg2);
    }

    public int AU3_WinGetStateByHandle(HWND arg0) {
        return LIB.AU3_WinGetStateByHandle(arg0);
    }

    public void AU3_WinGetTitleByHandle(HWND arg0, LPWSTR arg1, int arg2) {
        LIB.AU3_WinGetTitleByHandle(arg0, arg1, arg2);
    }

    public int AU3_WinActiveByHandle(HWND arg0) {
        return LIB.AU3_WinActiveByHandle(arg0);
    }

    public int AU3_StatusbarGetText(WString arg0, WString arg1, int arg2, LPWSTR arg3, int arg4) {
        return LIB.AU3_StatusbarGetText(arg0, arg1, arg2, arg3, arg4);
    }

    public void AU3_WinGetClassListByHandle(HWND arg0, LPWSTR arg1, int arg2) {
        LIB.AU3_WinGetClassListByHandle(arg0, arg1, arg2);
    }

    public DWORD AU3_WinGetProcess(WString arg0, WString arg1) {
        return LIB.AU3_WinGetProcess(arg0, arg1);
    }

    public int AU3_WinGetClientSizeByHandle(HWND arg0, RECT arg1) {
        return LIB.AU3_WinGetClientSizeByHandle(arg0, arg1);
    }

    public int AU3_WinGetCaretPos(Pointer arg0) {
        return LIB.AU3_WinGetCaretPos(arg0);
    }

    public int AU3_WinActivateByHandle(HWND arg0) {
        return LIB.AU3_WinActivateByHandle(arg0);
    }

    public int AU3_WinExistsByHandle(HWND arg0) {
        return LIB.AU3_WinExistsByHandle(arg0);
    }

    public void AU3_WinGetHandleAsText(WString arg0, WString arg1, LPWSTR arg2, int arg3) {
        LIB.AU3_WinGetHandleAsText(arg0, arg1, arg2, arg3);
    }

    public int AU3_StatusbarGetTextByHandle(HWND arg0, int arg1, LPWSTR arg2, int arg3) {
        return LIB.AU3_StatusbarGetTextByHandle(arg0, arg1, arg2, arg3);
    }

    public int AU3_WinCloseByHandle(HWND arg0) {
        return LIB.AU3_WinCloseByHandle(arg0);
    }

    public void AU3_WinGetClassList(WString arg0, WString arg1, LPWSTR arg2, int arg3) {
        LIB.AU3_WinGetClassList(arg0, arg1, arg2, arg3);
    }

    public int AU3_WinSetState(WString arg0, WString arg1, int arg2) {
        return LIB.AU3_WinSetState(arg0, arg1, arg2);
    }

    public int AU3_WinGetState(WString arg0, WString arg1) {
        return LIB.AU3_WinGetState(arg0, arg1);
    }

    public void AU3_WinGetText(WString arg0, WString arg1, LPWSTR arg2, int arg3) {
        LIB.AU3_WinGetText(arg0, arg1, arg2, arg3);
    }

    public int AU3_WinSetTitle(WString arg0, WString arg1, WString arg2) {
        return LIB.AU3_WinSetTitle(arg0, arg1, arg2);
    }

    public int AU3_WinSetTitle(WString arg0, WString arg1, WString arg2, WString arg3) {
        return LIB.AU3_WinSetTitle(arg0, arg1, arg2, arg3);
    }

    public int AU3_WinSetTrans(WString arg0, WString arg1, int arg2) {
        return LIB.AU3_WinSetTrans(arg0, arg1, arg2);
    }

    public int AU3_WinSetOnTop(WString arg0, WString arg1, int arg2) {
        return LIB.AU3_WinSetOnTop(arg0, arg1, arg2);
    }

    public int AU3_WinKill(WString arg0, WString arg1) {
        return LIB.AU3_WinKill(arg0, arg1);
    }

    public int AU3_WinGetPos(WString arg0, WString arg1, RECT arg2) {
        return LIB.AU3_WinGetPos(arg0, arg1, arg2);
    }

    public void AU3_WinGetTitle(WString arg0, WString arg1, LPWSTR arg2, int arg3) {
        LIB.AU3_WinGetTitle(arg0, arg1, arg2, arg3);
    }
}

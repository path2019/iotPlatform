@echo off
echo ***********************************************
echo     IOT 电信物联网平台参数设置和数据传输系统
echo ***********************************************

echo .
echo    请输入操作编号：
echo     1  将 IOT 平台数据传输至用户数据服务器；
echo     2  进行用户数据服务器IP地址的设置；
choice /C   12

echo .
if %errorlevel% == 1 start javaw -jar Receive.jar & exit
if %errorlevel% == 2 java -jar IpSet.jar

pause
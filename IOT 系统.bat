@echo off
echo ***********************************************
echo     IOT ����������ƽ̨�������ú����ݴ���ϵͳ
echo ***********************************************

echo .
echo    �����������ţ�
echo     1  �� IOT ƽ̨���ݴ������û����ݷ�������
echo     2  �����û����ݷ�����IP��ַ�����ã�
choice /C   12

echo .
if %errorlevel% == 1 start javaw -jar Receive.jar & exit
if %errorlevel% == 2 java -jar IpSet.jar

pause
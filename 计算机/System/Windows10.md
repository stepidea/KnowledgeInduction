1、WSL（Windows Subsystem for Linux）：适用于 Linux 的 Windows 子系统，例如:Ubuntu。

powershell命令：

wsl --list --verbose（wsl -l -v）：检查分配给每个已安装的 Linux 分发版的 WSL 版本。

wsl --set-version <distribution name> <versionNumber>：将分发版设置为受某一 WSL 版本支持。

wsl --list --all：查看子系统版本分发包

 wsl --unregister <distribution name>：注销子系统

2、docker切换为windows containers报错：

Powershell中使用提升的特权，

Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All（启动Hyper-V）;

Enable-WindowsOptionalFeature -Online -FeatureName Containers -All（启动容器）。
 
官网链接：https://docs.microsoft.com/zh-cn/windows/wsl/install-win10

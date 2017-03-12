$compname = "localhost"
$file = "C:\Users\Rafał\Desktop\Procesy.txt"
Write-Host "Zbieram dane..."
Get-WmiObject -computername $compname -class win32_process |
Select-Object name, processID, WorkingSetSize |
Format-Table | Out-File $file
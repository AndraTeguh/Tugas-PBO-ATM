Sistem ATM berfungsi untuk memberi layanan perbankan dengan beberapa fitur utama seperti
- Penarikan Uang
- Deposit
- Transfer
- Cek Saldo
- Ubah PIN

**TUGAS**
1. Fitur Ubah PIN
   - membuat metode changePin() di dalam kelas Account untuk mengubah PIN dengan verifikasi PIN lama yang digunakan untuk login, lalu meminta pengguna melakukan input PIN baru dan Konfirmasi input PIN tersebut, lalu melakukan validasi terhadap input dan konfirmasi PIN tersebut lalu Perbarui PIN jika validasi berhasil.
   - menambahkan opsi untuk mengubah pin di menu utama yang akan memanggil metode changePin().
   -
     ![Cuplikan layar 2024-11-14 160218](https://github.com/user-attachments/assets/4091d551-e629-4019-9473-c323deababef)

2. Validasi Saldo Minimal Penarikan
   - Memastikan bahwa saldo nasabah tidak akan di bawah saldo minimal yaitu Rp50.000 dengan menambahkan konstanta MINIMUM_BALANCE sebesar 50000, di kelas Account yang berfungsi untuk menyimpan nilai saldo minimum.
   - Melakukan modifikasi metode execute() untuk mengecek apakah penarikan saldo lebih besar atau sama dengan saldo minimum, jika saldo tersisa lebih rendah dari saldo minimal yang ditetapkan maka proses penarikan tidak akan dikerjakan. Dan jika saldo minimal mencukupi maka proses penarikan akan dikerjakan
   -
     ![Cuplikan layar 2024-11-14 160343](https://github.com/user-attachments/assets/722a41f0-7fdc-44f5-bec3-6262aa615ea4)

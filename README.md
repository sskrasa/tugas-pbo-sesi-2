# Tugas PBO Sesi II - Folder tugas2

## Deskripsi Tugas
Tugas ini membahas Class & Object di Java:
1. Teori tentang `class` dan `object`.
2. Jenis-jenis method di Java seperti getter, setter, constructor, static method, void method, dan return method.
3. Analisis kode class `Komputer`.
4. Perbaikan kode class `HandPhone` yang awalnya memiliki banyak kesalahan sintaks.

## File dalam folder
- `HandPhone.java` - kelas `HandPhone` yang telah diperbaiki.
- `Komputer.java` - kelas `Komputer` dengan field, setter, dan getter.
- `Main.java` - kelas utama untuk mengeksekusi kedua kelas tersebut.
- `build.sh` - skrip untuk mengkompilasi semua file Java.
- `.gitignore` - agar file kelas hasil kompilasi tidak masuk Git.

## Jawaban singkat tugas
### SOAL 1: Class dan Object
- `class` adalah cetak biru (template) atau definisi tipe data yang berisi atribut dan perilaku.
- `object` adalah instance nyata dari class yang berisi nilai konkret untuk atribut tersebut.

### SOAL 2: Jenis method di Java
- Void Method: method yang tidak mengembalikan nilai, misalnya `setDataKomputer(...)`.
- Return Method: method yang mengembalikan nilai, misalnya `getMerk()`.
- Accessor / Getter: membaca nilai field, misalnya `getMerk()`.
- Mutator / Setter: mengubah nilai field, misalnya `setDataKomputer(...)`.
- Constructor: method khusus untuk inisialisasi objek, nama sama dengan nama class.
- Static Method: method milik class, bukan object, contohnya `main`.
- Main Method: entry point program Java `public static void main(String[] args)`.

### SOAL 3: Analisis Kode Komputer
1. `public class Komputer {` mendeklarasikan class publik.
2. `String jenis_komputer; private String merk;` adalah field data.
3. `setDataKomputer` menetapkan nilai field.
4. `getJenis` mengembalikan `jenis_komputer`.
5. `getMerk` mengembalikan `merk`.
6. `Komputer mykom = new Komputer();` membuat object baru.
7. `mykom.setDataKomputer("LAPTOP", "MACBOOK");` memberi nilai ke object.
8. `System.out.println(...)` menampilkan data object.

### SOAL 4: Perbaikan Kode HandPhone
Kesalahan utama yang diperbaiki:
- Signature method `public void setDataHP(...)`.
- `this.jenis_hp = jenis_hp;` dan `this.tahun_pembuatan = tahun_pembuatan;`.
- Getter mengembalikan nilai.
- `public static void main(String[] args)` dibuat benar.
- Menambahkan `System.out.println(...)` untuk menampilkan output.

## Cara compile dan jalankan
```bash
cd /home/swift/PBO/tugas2
bash build.sh
java Main
```

## Cara membuat link GitHub
Jika kamu butuh link untuk dikumpulkan, berikut langkahnya:

1. Buat repository baru di GitHub (misalnya `tugas-pbo-tugas2`).
2. Tambahkan remote origin di folder lokal:
   ```bash
cd /home/swift/PBO/tugas2
git remote add origin https://github.com/USERNAME/tugas-pbo-tugas2.git
git branch -M main
git push -u origin main
```
3. Salin URL repository GitHub yang muncul di browser.

> Saat ini repository sudah dibuat secara lokal di `PBO/tugas2` dan sudah memiliki commit awal. Kamu hanya perlu melakukan push ke GitHub.

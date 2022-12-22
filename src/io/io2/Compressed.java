//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.util.zip.GZIPOutputStream;
//
//class Compressed {
//    /**
//     * Opens the file with the data.
//     * A rewind will happen, if this method gets called more than once.
//     **/
//    public void openFileForReading() {
//        try {
//            if (isBinaryInput) {
//                bInputStream = new DataInputStream(
//                        new GZIPInputStream(
//                                new FileInputStream(inputFileName)
//                        )
//                );
//
//            } else {
//                inputStream = new BufferedReader(new FileReader(inputFileName));
//            }
//                ...
//        } catch (Exception e) {
//            e.printStackTrace();
//            InOutErr.out.println("ParticleViewExtractor: -openFileForReading- " + e);
//        }
//    }
//
//
//    /*
//     * Convert Data to Binary format
//     */
//    public void doConvertToBinary(String fileName) {
//        try {
//            BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
//            DataOutputStream outputStream = new DataOutputStream(
//                    new GZIPOutputStream(
//                            new FileOutputStream(fileName + ".binary.Z")
//                    )
//            );
//        } catch (Exception e) {}
//    }
//
//}
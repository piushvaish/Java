package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piush on 14/04/2017.
 */
public interface IStorageMedium {
 void read(List<String> saveValues);
 List<String> write();
}

package com.rosalvavenegas.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Rosalva on 05/12/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

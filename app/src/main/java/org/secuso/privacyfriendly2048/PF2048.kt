/*
 This file is part of Privacy Friendly 2048.

 Privacy Friendly Sudoku is free software:
 you can redistribute it and/or modify it under the terms of the
 GNU General Public License as published by the Free Software Foundation,
 either version 3 of the License, or any later version.

 Privacy Friendly Sudoku is distributed in the hope
 that it will be useful, but WITHOUT ANY WARRANTY; without even
 the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 See the GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Privacy Friendly Sudoku. If not, see <http://www.gnu.org/licenses/>.
 */
package org.secuso.privacyfriendly2048

import android.app.Application
import android.util.Log
import androidx.work.Configuration
import org.secuso.privacyfriendly2048.backup.BackupCreator
import org.secuso.privacyfriendly2048.backup.BackupRestorer
import org.secuso.privacyfriendlybackup.api.pfa.BackupManager

class PF2048 : Application(), Configuration.Provider {
    override fun onCreate() {
        BackupManager.backupCreator = BackupCreator()
        BackupManager.backupRestorer = BackupRestorer()
        super.onCreate()
    }

    override val workManagerConfiguration = Configuration.Builder().setMinimumLoggingLevel(Log.INFO).build()
}

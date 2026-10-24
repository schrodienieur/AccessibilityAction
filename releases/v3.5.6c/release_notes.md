# **Custom branch release**

Based on upstream `v3.5.6`, with the following additions:

&nbsp;
# **Added**
1. `voucherFlashSalev2.bsh` (Tokopedia) — shipping-method variant targeting Kurir toko (Rp0), using hardcoded node ids `jf7`/`dd2`.
2. `ppPaymentFlashSale.bsh` (Tokopedia) — Tokopedia payment flash sale.
3. Shopee flash sale scripts: `cpFlashSale.bsh`, `pdpOOSFlashsale.bsh`, `pdpVoucherFlashSale.bsh`.
4. `waitNTP.bsh` — NTP sync and precise wait until a target time.
5. Dialog functions: `dateTimePickerDialog`, `choiceDialog`, `longInputDialog`, with `importCommands("dialog")` wired into `code/import.java`.
6. Release trigger for custom `v*.*.*-*` tags.

&nbsp;
# **Fixes**
1. `Undefined argument TOP` crash at `assist/NodeInfo.bsh` line 104 on devices whose framework does not expose the private `AccessibilityNodeInfo.mBooleanProperties` field. The reflection failure was already handled via `hasPropertyField`; the crash came from the log call in the `catch` block referencing an undeclared `TOP`.

&nbsp;
# **Changed**
1. `UpdateManager` owner set to `schrodienieur` so custom releases are served from this fork. Upstream's `timeoutDuration` rewrite is kept; only `owner` differs from upstream.
2. Synced with upstream through `v3.5.6` (v3.5.3 – v3.5.6: update manager timeout, null and constant fixes, script editor on lock screen, launch activity fixes, autoinput variable generation, dialog updates).
3. The custom `TYPE_WINDOW_CONTROL` workaround in `window/WindowInfo.bsh` is retired: upstream now hardcodes `1 << 7` as well, so the merged file matches upstream. The Samsung crash fix is preserved either way.

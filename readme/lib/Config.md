# [Config](/code/lib/Config.bsh)

Load, save, and synchronize configuration presets and runtime variables from a file.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`Config` is a helper function or object from the lib folder that provides load, save, and synchronize configuration presets and runtime variables from a file.
It exposes methods such as `getSettings, save, setTo, loadFrom, updateMissing, load`.

# How to use

```
cfg = Config("/sdcard/config.bsh");
```

```
cfg.save();
```

## Return Value
Returns a scripted Config object.
